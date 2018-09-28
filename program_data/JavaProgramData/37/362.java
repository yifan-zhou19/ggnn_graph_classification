package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[26];
		int[] l = new int[100];
		int i;
		int j;
		int t;
		int m;
		int count = 0;
		int a;
		int[] num = new int[26];
		char[][] s = new char[10][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s[i] = tempVar2.charAt(0);
		  }
		  l[i] = String.valueOf(s[i]).length();
		 int[] b = new int[26];
		 int[] num = new int[26];
		  for (j = 0;j < l[i];j++)
		  {
			m = s[i][j] - 'a';
			num[j] = m;
			b[m]++;
		  }
		for (a = 0;a < 26;a++)
		{
			count = 0;
		   if (b[num[a]] == 1)
		   {
			s[i][j] = 'a' + num[a];
			System.out.printf("%c\n",s[i][j]);
			count++;
			break;
		   }
		}
		if (count == 0)
		{
		System.out.print("no\n");
		}
		}
		System.in.read();
		System.in.read();
	}
}

