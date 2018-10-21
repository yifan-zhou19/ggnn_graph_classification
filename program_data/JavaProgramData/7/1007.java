package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[256]);
	public static String sub = new String(new char[256]);
	public static String repl = new String(new char[256]);
	public static int i = 0;
	public static int j = 0;
	public static int k;
	public static int m = 0;
	public static int Main()
	{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead("\n");
		  if (tempVar2 != null)
		  {
			  sub = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead("\n");
		  if (tempVar3 != null)
		  {
			  repl = tempVar3.charAt(0);
		  }
		  for (i = 0;str.charAt(i) != '\0';i++)
		  {
									  if (sub.charAt(0) == str.charAt(i))
									  {
																 k = i + 1;
																 j = 1;
																 for (j = 1;sub.charAt(j) != '\0';j++)
																 {
																							 if (sub.charAt(j) == str.charAt(k))
																							 {
																														k++;
																							 }
																							 else
																							 {
																								 break;
																							 }
																 }
																 if (sub.charAt(j) == '\0')
																 {
																				 break;

																 }
									  }
		  }
		  for (m = 0;repl.charAt(m) != '\0';m++)
		  {
									if (str.charAt(i) == '\0')
									{
													break;
									}
									str = tangible.StringFunctions.changeCharacter(str, i, repl.charAt(m));
									i++;
		  }
		  System.out.printf("%s\n",str);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}







}

