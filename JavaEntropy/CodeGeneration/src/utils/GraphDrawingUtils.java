/**
 * 
 */
package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import config.GlobalConfig;
import datastructure.Edge;
import datastructure.GlobalData;
import datastructure.Graph;
import datastructure.Node;

/**
 * @author anhnt_000
 *
 */
public class GraphDrawingUtils {

	// Node size
	private static Map<Integer, List<Integer>> unknownNodesMap = new HashMap<Integer, List<Integer>>();
	private static Map<Integer, Integer> numberOfNodesMap = new HashMap<Integer, Integer>();

	public static void initMap() {
		for (int i = 1; i <= GlobalConfig.maxGraphSize; i++) {
			unknownNodesMap.put(i, new ArrayList<Integer>());
		}
		
		for(int i = 1; i <= GlobalConfig.maxGraphSize; i++) {
			numberOfNodesMap.put(i, 0);
		}
	}

	public static Map<Integer, List<Integer>> getUnknownNodesMap() {
		return unknownNodesMap;
	}

	public static Map<Integer, Integer> getNumberOfNodesMap() {
		return numberOfNodesMap;
	}

	public static double getAverage(List<Integer> list) {

		double avg = 0;
		double sum = 0;
		for (Integer integer : list) {
			sum += integer;
		}
		avg = sum /((double) list.size());

		return avg;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static String creatDotStr(Graph gr, GlobalData globalData) {
		StringBuffer sb = new StringBuffer();
		sb.append("digraph mygraph { " + System.lineSeparator());
		int countNode = 0;
		HashMap<Node, String> nodeNameMap = new HashMap<Node, String>();

		int countUnknown = 0;

		for (Node node : gr.nodes) {
			String nodeName = "node" + countNode;
			nodeNameMap.put(node, nodeName);
			String shape = "box";
			if (node.nodeRole == 2) {
				shape = "diamond";
			}
			sb.append(nodeName + " [label=\"" + node.getNodeLabel(globalData) + "\", shape=" + shape + "];"
					+ System.lineSeparator());
			countNode++;

			//if (node.getNodeLabel(globalData).contains("unknown")) {
//				System.out.println("Contains unknown ");
				//countUnknown++;
			//}
		}

//		System.out.println("countNode " + countNode);
//		System.out.println("countUnknown " + countUnknown);
		//unknownNodesMap.get(new Integer(countNode)).add(countUnknown);
//		int existingCount = numberOfNodesMap.get(new Integer(countNode));
		//numberOfNodesMap.put(countNode, ++existingCount);

		// Logger.log("nodeNameMap: " + nodeNameMap);
		for (Edge edge : gr.edges) {
			if (edge == null) {
				continue;
			}
			Node sourceNode = edge.sourceNode;
			// Logger.log("sourceNode: " + sourceNode + "///" +
			// nodeNameMap.get(sourceNode));

			Node sinkNode = edge.sinkNode;
			// Logger.log("sinkNode: " + sinkNode + "///" +
			// nodeNameMap.get(sinkNode));

			sb.append(nodeNameMap.get(sourceNode) + "->" + nodeNameMap.get(sinkNode) + ";" + System.lineSeparator());
		}

		sb.append("}");
		return sb.toString();
	}

	public static void callConvert(String dotPath, String gifPath) {
		try {
			String cmd = "dot -Tgif " + dotPath + " -o " + gifPath;
			Process p = Runtime.getRuntime().exec(cmd);
			p.waitFor();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void outputDotFile(Graph gr, String outputPath, GlobalData globalData) {
		try {
			FileWriter fw = new FileWriter(outputPath);
			fw.append(creatDotStr(gr, globalData));
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void outputsequenceFile(Graph gr, String outputPath, GlobalData globalData) {
		try {
			FileWriter fw = new FileWriter(outputPath);
			fw.append(gr.getNodeSequenceStr(globalData));
			// fw.append(creatDotStr(gr, globalData));
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
