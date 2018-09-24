package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int n;
		 int[] a = new int[1000];
		 int i;
		 int l;
		 int j;
		 int max;
		 int[] s = new int[26];
		 char[][] c = new char[1000][27];
		 char w;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 c[i] = tempVar3.charAt(0);
		 }
		 l = String.valueOf(c[i]).length();
		 for (j = 0;j < l;j++)
		 {
			 s[c[i][j] - 65]++;
		 }
		 }
		 max = s[0];
		 w = 'A';
		 for (i = 1;i < 26;i++)
		 {
		 if (s[i] > max)
		 {
					  max = s[i];
					  w = i + 65;
		 }
		 }
		 System.out.printf("%c\n%d\n",w,max);
		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;c[i][j] != '\0';j++)
			 {
				 if (c[i][j] == w)
				 {
								System.out.printf("%d\n",a[i]);
								break;
				 }
			 }
		 }

	}

}

