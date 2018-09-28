package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int k;
		 int d;
		 int n;
		 int t;
		 String a = new String(new char[100001]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		for (i = 0;i < n;i++)
		{
			t = 0;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = tempVar2.charAt(0);
			 }
			for (j = 0;j < a.length();j++)
			{
				d = 0;
				 for (k = 0;k < a.length();k++)
				 {
					 if (a.charAt(k) == a.charAt(j))
					 {
					d++;
					 }
				 }
				if (d == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					t = 1;
					break;
				}
			}
			if (t == 0)
			{
			System.out.print("no");
			}
		}
	return 0;
	}

}

