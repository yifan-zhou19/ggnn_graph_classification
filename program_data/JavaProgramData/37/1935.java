package <missing>;

public class GlobalMembers
{
	public static int min(int x,int y)
	{
		if (x >= y)
		{
			return y;
		}
		else
		{
			return x;
		}
	}
	public static int Main()
	{
		 int t;
		 int i;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 t = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < t;i++)
		 {
			 int[] b = new int[100000];
			 int a;
			 int j;
			 int k;
			 String s = new String(new char[100000]);
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s = tempVar2.charAt(0);
			 }
			 a = s.length();
			 for (j = 0;j < a;j++)
			 {
				 for (k = 0;k < a;k++)
				 {
					 if (s.charAt(j) == s.charAt(k))
					 {
						 b[j]++;
					 }
				 }
			 }
			 for (j = 0;j < a;j++)
			 {
				 if (b[j] == 1)
				 {
					  System.out.printf("%c\n",s.charAt(j));
					  break;
				 }
			 }
			 for (j = 1;j < a;j++)
			 {
				 b[0] = min(b[0], b[j]);
			 }
			 if (b[0] > 1)
			 {
				 System.out.print("no\n");
			 }
		 }

	}


}

