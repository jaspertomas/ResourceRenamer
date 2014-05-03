/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package folderrenamer;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author jaspertomas
 */
public class ResourceRenamer {

	public static void main(String[] args) {
            new NewJFrame().setVisible(true);
//	    Collection<File> all = new ArrayList<File>();
//	    addTree(new File("."), all);
//	    System.out.println(all);
	}

	static void addTree(File file, Collection<File> all) {
	    File[] children = file.listFiles();
	    if (children != null) {
	        for (File child : children) {
                    System.out.println(child);
	            all.add(child);
	            //addTree(child, all);
	        }
	    }
	}
}
