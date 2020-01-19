/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rf08GenerateGetterSetter;

/**
 *
 * @author Zakaria Ahmmed
 */
public class Generator {
    public static void createSetter(String fName, String fType, StringBuffer sb) {

		sb.append("public void").append(" set");
		sb.append(getFieldName(fName));
		sb.append("(" + fType + " " + fName + ") {");
		sb.append("\n\t this." + fName + " = " + fName + ";");
		sb.append("\n" + "}" + "\n");
	}

	public static void createGetter(String fName, String fType, StringBuffer sb) {
		sb.append("public " + fType)
				.append((fType.equals("boolean") ? " is" : " get") + getFieldName(fName) + "(){");
		sb.append("\n\treturn " + fName + ";");
		sb.append("\n" + "}" + "\n");
	}

	private static String getFieldName(String fName) {
		return fName.substring(0, 1).toUpperCase() + fName.substring(1, fName.length());
	}
}
