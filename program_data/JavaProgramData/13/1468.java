package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int m;
		 int k;
		 int i;
		 int j;
		 int l;
		 int[] s = new int[12000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 m = n;
		 l = 0;
		 for (i = 1;i <= n;i++)
		 {
			 l++;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s[l] = Integer.parseInt(tempVar2);
		 }
					 for (j = 1;j <= l - 1;j++)
					 {
					 if (s[j] == s[l])
					 {
					 l--;
					 m--;
					 }
					 }
		 }
			for (i = 1;i <= m - 1;i++)
			{
			System.out.printf("%d ",s[i]);
			}
			System.out.printf("%d",s[m]);

	}

}

