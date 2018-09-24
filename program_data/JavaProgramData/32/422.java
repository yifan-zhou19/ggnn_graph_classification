package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String[] pp;

	 int n;
	 int h;
	 int m = 100;
	 int i;
	 int x;
	 int y;
	 int a = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 h = Integer.parseInt(tempVar);
	 }
	 n = 2 * h;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	 pp = (String)malloc(n * sizeof(String));

	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  pp[i] = (String)malloc(m * (Character.SIZE / Byte.SIZE));
	 }
	 for (i = 0;i < h;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			pp[2 * i] = tempVar2.charAt(0);
		}
		x = String.valueOf(pp[2 * i]).length();
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			pp[2 * i + 1] = tempVar3.charAt(0);
		}
		y = String.valueOf(pp[2 * i + 1]).length();
		 for (a = x - 1;a > x - y - 1;a--)
		 {
		  pp[2 * i][a] = pp[2 * i][a] - pp[2 * i + 1][a - x + y] + '0';
		  if (pp[2 * i][a] < '0')
		  {
			  pp[2 * i][a] = pp[2 * i][a] + 10;
			  pp[2 * i][a - 1] = pp[2 * i][a - 1] - 1;
		  }

		 }

	 }

	 System.out.print("\n");
	 for (i = 0;i < h;i++)
	 {
	   System.out.printf("%s\n",pp[2 * i]);
	 }
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(pp[i]);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(pp);
	}

}

