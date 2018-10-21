package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int flag;
	  int v = 0;
	  int x;
	  int y;
	  int xci;
	  String str = new String(new char[500]);
	  char[][] hw = new char[100][200];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  str = tempVar.charAt(0);
	  }
	  int l = str.length();
	  for (i = 2;i <= l;i++)
	  {
		xci = i / 2;
		for (j = 0;j + i <= l + 1;j++)
		{
		  flag = 1;
		  for (k = 0;k < xci;k++)
		  {
			if (str.charAt(j + k) != str.charAt(j + i - 1 - k))
			{
				flag = 0;
			}
		  }
		  if (flag == 1)
		  {
			for (x = 0;x < i;x++)
			{
			hw[v][x] = str.charAt(j + x);
			}
			hw[v][x] = '\0';
			v++;
		  }
		}
	  }
	  for (i = 0;i < v;i++)
	  {
	  System.out.printf("%s\n",hw[i]);
	  }


	}
}

