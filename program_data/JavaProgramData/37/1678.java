package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String s = new String(new char[100000]);
		 char temp;
		 int lens;
		 int i;
		 int j;
		 int k;
		 int n;
		 int z;
		 int pt;
		 int num;
		 int[][] a = new int[26][2];

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (z = 1;z <= n;z++)
		 {
			 num = 0;
			 for (i = 0;i <= 25;i++)
			 {
				 for (j = 0;j <= 1;j++)
				 {
					 a[i][j] = 0;
				 }
			 }
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s = tempVar2.charAt(0);
			 }
			 for (pt = 0;s.charAt(pt) != '\0';pt++)
			 {
				 temp = s.charAt(pt) - 'a';
				 if (a[temp][1] == 0)
				 {
					num++;
					a[temp][1] = num;
				 }
				 a[temp][0]++;
			 }

			 pt = -1;
			 k = 31;
			 for (i = 0;i <= 25;i++)
			 {
				 if (a[i][0] == 1)
				 {
					if (k > a[i][1])
					{
					   pt = i;
					   k = a[i][1];
					}
				 }
			 }

			 if (pt == -1)
			 {
				 System.out.print("no\n");
			 }
			 else
			 {
				 System.out.printf("%c\n",pt + 'a');
			 }
		 }
	}


}

