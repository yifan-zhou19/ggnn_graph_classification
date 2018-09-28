package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  int i;
	  int j;
	  int l;
	  String a = new String(new char[L]);
	  int[] b = new int[L];
	  int state;
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
				a = tempVar2.charAt(0);
			}
			state = 0;
		l = a.length();
		 for (j = 0;j < l;j++)
		 {
		  b[j] = 0;
		 }
		for (j = 0;j < l;j++)
		{
		  for (m = 0;m < l;m++)
		  {
			if (a.charAt(j) == a.charAt(m))
			{
			  b[j]++;
			}
		  }
		}
		for (j = 0;j < l;j++)
		{
		  if (b[j] == 1)
		  {
			System.out.printf("%c\n",a.charAt(j));
			state = 1;
			break;
		  }
		}
		if (state == 0)
		{
		  System.out.print("no\n");
		}
	  }
	  return 0;
	}

}

