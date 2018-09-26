package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String p = new String(new char[501]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   p = tempVar.charAt(0);
	   }
	   int len = p.length();
	   for (int i = 2;i < len;i++)
	   {
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char **q=(char **)malloc(sizeof(char *)*len);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		   char[] q = (String)malloc(sizeof(String) * len);
		   for (int j = 0;j < len - i + 1;j++)
		   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				   q[j] = (String)malloc((i + 1) * (Character.SIZE / Byte.SIZE));
				   for (int h = 0;h < i + 1;h++)
				   {
					   q[j][h] = '\0';
				   }
				   for (int h = 0;h < i;h++)
				   {
					   q[j][h] = p.charAt(j + h);
				   }
		   }
		   for (int j = 0;j < len - i + 1;j++)
		   {
				final String temp = "";
				int k = 0;
				for (int h = i - 1;h >= 0;h--)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, k, q[j][h]);
					k++;
				}
				if (strcmp(temp,q[j]) == 0)
				{
				   System.out.printf("%s\n",q[j]);
				}
		   }
	   }
	}

}

