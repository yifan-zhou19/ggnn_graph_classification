package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char c = '0';
	 String[] s = new String[100];
	 String t = new String(new char[100]);
	 String r = new String(new char[100]);
	 int i = 0;
	 int j;
	 while (c != '\n')
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
					s[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 100);
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						s[i++] = tempVar.charAt(0);
					}
					String tempVar2 = ConsoleInput.scanfRead(null, 1);
					if (tempVar2 != null)
					{
						c = tempVar2.charAt(0);
					}
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 t = tempVar3.charAt(0);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 r = tempVar4.charAt(0);
	 }
	 for (j = 0;j < i;j++)
	 {
	  if (strcmp(t,s[j]) == 0)
	  {
	   s[j] = r;
	  }
	  System.out.printf("%s",s[j]);
	  if (j < i - 1)
	  {
	   System.out.print(" ");
	  }
	 }
	return 0;
	}
}

