package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String a = new String(new char[101]);
	  int[] b = new int[101];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  int len = a.length();
	  int i;
	  int j;

	  int t = 1;
	  while (t != 0)
	  {
		for (i = 0;i < len - 1;i++)
		{
		  if (a.charAt(i) == a.charAt(0) && b[i] == 0)
		  {
		  for (j = i + 1;j < len;j++)
		  {
			if (b[j] == 1)
			{
			  continue;
			}
			else if (a.charAt(j) == a.charAt(0))
			{
			  break;
			}
			else
			{
			  b[i] = 1;
			  b[j] = 1;

			  System.out.printf("%d %d\n",i,j);
			  if (j == len - 1)
			  {
			   t = 0;
			  }
			  i = 0;
			  break;
			}
		  }
		  }
		}
	  }
	}
}

