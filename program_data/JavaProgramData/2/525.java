package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int n;
		int i;
		int book;
		int max = 0;
		int pos;
		int[][] a = new int[30][1000];
		String s = new String(new char[100]);
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
			  book = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  s = tempVar3.charAt(0);
		  }
		  for (j = 0;j < s.length();j++)
		  {
			  a[s.charAt(j) - 'A'][0]++;
			  a[s.charAt(j) - 'A'][a[s.charAt(j) - 'A'][0]] = book;
		  }
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i][0] > max)
			{
				max = a[i][0];
				pos = i;
			}
		}
		System.out.printf("%c\n%d\n",pos + 'A',a[pos][0]);
		for (i = 1;i <= a[pos][0];i++)
		{
			System.out.printf("%d\n",a[pos][i]);
		}
	}
}

