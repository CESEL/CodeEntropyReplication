package config;

import java.util.Arrays;
import java.util.HashSet;

public class GlobalConfig {
	public static final String[] sourceFileJavaExt = {".java"};
	
	public static final int maxGraphSize = 5;
	public static final int maxCountNode = 20;

	public static final int topGraphSize = 20;
	public static final String containStr = "java.util.Iterator.hasNext";
	
	
	public static int SVNWindowSize = 100;
	public static String SVNURL = "file:///remote/rs/tien/sourceforge/repositories/";
	
	public static String mainDir = "/remote/rs/tien/anhnt/TextToCode/";
	public static String graphDatabasePath = mainDir + "database/graphDB.dat";
	public static String nodeGraphDatabasePath = mainDir + "database/nodeGraphDB.dat";

	public static String mainDummyDir = mainDir + "dummy_dir/";
	public static String slotDummyDir = mainDummyDir + "slot1/";
	public static String dummyDir = slotDummyDir + "0/";
//	public static String dummyDir = "f:/dummy_dir/";
	public static String slotMapPath = mainDir + "slotMap.dat";
	public static String hashDBDir = mainDir + "hash_database/"; 
	public static String hashDBPath = mainDir + "hash_database.dat"; 
	
	public static String recTestDir = mainDir + "TestProjects/";


	public static String projectDataDir = mainDir + "project_data/";
	public static String localRepoDir = "f:/Repositories/";
//	public static String processJavaDirPath = "data/db4o/java_src/";
	public static String processJavaDirPath = mainDir + "data/db4o/java_src/";
	
	
	public static boolean useTrunkOnly = false;
	
	public static boolean useSourcePathFilter = true;
	
	public static String dataExt = ".dat";

	
	public static String name = "anh";
	public static String password = "Vietus09";
	

	public static boolean isReadDirectFromRepo = false;
	
	
	public static String repoFilePath = mainDir + "repoList.txt";
	
	public static final int timeout = 120; 

	
	
	public static String queryListFilePath = mainDir + "queryList.txt";
	public static String graphOutputPath = mainDir + "graphOutput/";
	
	public static String tableDirPath = "/remote/rs/tien/anhnt/TextToCode/database/";
	public static String cltPath = tableDirPath + "clt.table";
	public static String cltTablePath = "/data/anhnt/TextToCode/data/" + "clt.dat";
	public static String postCLTMapPath = "/data/anhnt/TextToCode/data/" + "postCLTMap.dat";

	public static String bigQueryListPath = mainDir + "bigQueryList.txt";
	public static String postDebugPath = mainDir + "postDebug.txt";

	
	public static int maxNumQueries = 5000;

	
	public static String postTestDataPath = "/data/thanh/TestSet.dat";
	public static String tmpDir = "/data/anhnt/TextToCode/tmp/";
	
	public static String CLTOutputPath = mainDir + "apis.csv";
	
	public static int maxCLTSize = 25;
	public static int pruneSize =30;
	public static int maxTestSetSize = 1000;
	
	public static double penaltyForNoConnection =  -10;
	
	public static int minNConnectedEdge =20;
	public static int minAcceptedAsChild = 20;
	public static int minShared = 20;

	public static int maxThreads= 1;
	
	public static String testQueryPath = mainDir +  "QueryFromThanh.txt";
	public static String tmpQueryPath = mainDir +  "tmpQueryFromThanh.txt";
	public static String graphComparisonPath = mainDir + "graphCompData.dat";
	public static String graphComparisonRelaxPath = mainDir + "graphCompDataRelax.dat";
			
	public static String dummyDirPath = mainDir + "dummydir//";
	
	public static boolean isUSeNonLegalForSyn = false;
	public static HashSet<Long> blacklistedIDs = new HashSet<Long>(Arrays.asList(
			11328028l,11330732l, 12189899l, 2709968l, 4209944l, 8158256l, 9458760l, 6868980l, 6938769l, 8226267l, 11629262l, 4008755l, 4023384l,
			23989947l,8563559l, 8009275l, 10816846l, 6868980l));
//	public static HashSet<Long> blacklistedIDs = new HashSet<Long>();
	
	
	public static String [] nonLegalStrs = {"TRY","RETURN","CATCH", "FINALLY"};
	
	public static boolean isUseExternalPivot = true;

	/*
	public static String[] concernedLibs = 
		{
//		"ControlInfo",
		"java.applet", 
		"java.awt", 
		"java.beans", 
		"java.io", 
		"java.lang", 
		"java.math", 
		"java.net", 
		"java.nio", 
		"java.rmi", 
		"java.security",
		"java.sql", 
		"java.text",
		"java.util", 
		"javax.accessibility", 
		"javax.activation",
		"javax.activity", 
		"javax.annotation", 
		"javax.crypto", 
		"javax.imageio", 
		"javax.jws", 
		"javax.lang.model", 
		"javax.management", 
		"javax.naming", 
		"javax.net",
		"javax.print",
		"javax.rmi", 
		"javax.script", 
		"javax.security", 
		"javax.sound.midi", 
		"javax.sql", 
		"javax.swing", 
		"javax.tools", 
		"javax.transaction", 
		"javax.xml", 
		"org.ietf.jgss", 
		"org.omg", 
		"org.w3c", 
		"org.xml"
		};
		
		*/
	
	public static String[] concernedLibs = 
		{
			//	"ControlInfo",
			    "java.applet",
			    "java.awt",
			    "java.awt.color",
			    "java.awt.datatransfer",
			    "java.awt.dnd",
			    "java.awt.event",
			    "java.awt.font",
			    "java.awt.geom",
			    "java.awt.im",
			    "java.awt.im.spi",
			    "java.awt.image",
			    "java.awt.image.renderable",
			    "java.awt.print",
			    "java.beans",
			    "java.beans.beancontext",
			    "java.io",
			    "java.lang",
			    "java.lang.annotation",
			    "java.lang.instrument",
			    "java.lang.invoke",
			    "java.lang.management",
			    "java.lang.ref",
			    "java.lang.reflect",
			    "java.math",
			    "java.net",
			    "java.nio",
			    "java.nio.channels",
			    "java.nio.channels.spi",
			    "java.nio.charset",
			    "java.nio.charset.spi",
			    "java.nio.file",
			    "java.nio.file.attribute",
			    "java.nio.file.spi",
			    "java.rmi",
			    "java.rmi.activation",
			    "java.rmi.dgc",
			    "java.rmi.registry",
			    "java.rmi.server",
			    "java.security",
			    "java.security.acl",
			    "java.security.cert",
			    "java.security.interfaces",
			    "java.security.spec",
			    "java.sql",
			    "java.text",
			    "java.text.spi",
			    "java.util",
			    "java.util.concurrent",
			    "java.util.concurrent.atomic",
			    "java.util.concurrent.locks",
			    "java.util.jar",
			    "java.util.logging",
			    "java.util.prefs",
			    "java.util.regex",
			    "java.util.spi",
			    "java.util.zip",
			    "javax.accessibility",
			    "javax.activation",
			    "javax.activity",
			    "javax.annotation",
			    "javax.annotation.processing",
			    "javax.crypto",
			    "javax.crypto.interfaces",
			    "javax.crypto.spec",
			    "javax.imageio",
			    "javax.imageio.event",
			    "javax.imageio.metadata",
			    "javax.imageio.plugins.bmp",
			    "javax.imageio.plugins.jpeg",
			    "javax.imageio.spi",
			    "javax.imageio.stream",
			    "javax.jws",
			    "javax.jws.soap",
			    "javax.lang.model",
			    "javax.lang.model.element",
			    "javax.lang.model.type",
			    "javax.lang.model.util",
			    "javax.management",
			    "javax.management.loading",
			    "javax.management.modelmbean",
			    "javax.management.monitor",
			    "javax.management.openmbean",
			    "javax.management.relation",
			    "javax.management.remote",
			    "javax.management.remote.rmi",
			    "javax.management.timer",
			    "javax.naming",
			    "javax.naming.directory",
			    "javax.naming.event",
			    "javax.naming.ldap",
			    "javax.naming.spi",
			    "javax.net",
			    "javax.net.ssl",
			    "javax.print",
			    "javax.print.attribute",
			    "javax.print.attribute.standard",
			    "javax.print.event",
			    "javax.rmi",
			    "javax.rmi.CORBA",
			    "javax.rmi.ssl",
			    "javax.script",
			    "javax.security.auth",
			    "javax.security.auth.callback",
			    "javax.security.auth.kerberos",
			    "javax.security.auth.login",
			    "javax.security.auth.spi",
			    "javax.security.auth.x500",
			    "javax.security.cert",
			    "javax.security.sasl",
			    "javax.sound.midi",
			    "javax.sound.midi.spi",
			    "javax.sound.sampled",
			    "javax.sound.sampled.spi",
			    "javax.sql",
			    "javax.sql.rowset",
			    "javax.sql.rowset.serial",
			    "javax.sql.rowset.spi",
			    "javax.swing",
			    "javax.swing.border",
			    "javax.swing.colorchooser",
			    "javax.swing.event",
			    "javax.swing.filechooser",
			    "javax.swing.plaf",
			    "javax.swing.plaf.basic",
			    "javax.swing.plaf.metal",
			    "javax.swing.plaf.multi",
			    "javax.swing.plaf.nimbus",
			    "javax.swing.plaf.synth",
			    "javax.swing.table",
			    "javax.swing.text",
			    "javax.swing.text.html",
			    "javax.swing.text.html.parser",
			    "javax.swing.text.rtf",
			    "javax.swing.tree",
			    "javax.swing.undo",
			    "javax.tools",
			    "javax.transaction",
			    "javax.transaction.xa",
			    "javax.xml",
			    "javax.xml.bind",
			    "javax.xml.bind.annotation",
			    "javax.xml.bind.annotation.adapters",
			    "javax.xml.bind.attachment",
			    "javax.xml.bind.helpers",
			    "javax.xml.bind.util",
			    "javax.xml.crypto",
			    "javax.xml.crypto.dom",
			    "javax.xml.crypto.dsig",
			    "javax.xml.crypto.dsig.dom",
			    "javax.xml.crypto.dsig.keyinfo",
			    "javax.xml.crypto.dsig.spec",
			    "javax.xml.datatype",
			    "javax.xml.namespace",
			    "javax.xml.parsers",
			    "javax.xml.soap",
			    "javax.xml.stream",
			    "javax.xml.stream.events",
			    "javax.xml.stream.util",
			    "javax.xml.transform",
			    "javax.xml.transform.dom",
			    "javax.xml.transform.sax",
			    "javax.xml.transform.stax",
			    "javax.xml.transform.stream",
			    "javax.xml.validation",
			    "javax.xml.ws",
			    "javax.xml.ws.handler",
			    "javax.xml.ws.handler.soap",
			    "javax.xml.ws.http",
			    "javax.xml.ws.soap",
			    "javax.xml.ws.spi",
			    "javax.xml.ws.spi.http",
			    "javax.xml.ws.wsaddressing",
			    "javax.xml.xpath",
			    "org.w3c.dom",
			    "org.w3c.dom.bootstrap",
			    "org.w3c.dom.events",
			    "org.w3c.dom.ls",
			    "org.xml.sax",
			    "org.xml.sax.ext",
			    "org.xml.sax.helpers"
		};
	
	public static void main(String args[]) {
		String s1 = "org.w3c.dom";
		String s2 = "org.apache.tools.";
		
		System.out.println("s2.startswith(s1) : " + s2.startsWith(s1));
	}
		
}
