package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x = 0;
		double ratio = 0;
		int i = 0;
		int num = 0;
		int l1 = 0;
		int l2 = 0;
		int temp = 1;
		String sequen1 = new String(new char[LEN]);
		String sequen2 = new String(new char[LEN]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sequen1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sequen2 = tempVar3.charAt(0);
		}
		l1 = sequen1.length();
		l2 = sequen2.length();
		if (l1 != l2)
		{
		  System.out.print("error");
		  temp = 0;
		}
		else
		{
		  for (i = 0;i < l1;i++)
		  {
			if ((sequen1.charAt(i) != 'A' && sequen1.charAt(i) != 'T' && sequen1.charAt(i) != 'G' && sequen1.charAt(i) != 'C') || (sequen2.charAt(i) != 'A' && sequen2.charAt(i) != 'T' && sequen2.charAt(i) != 'G' && sequen2.charAt(i) != 'C'))
			{
			  System.out.print("error");
			  temp = 0;
			  break;
			}
		  }
		}
		if (temp == 1)
		{
		  for (i = 0;i < l1;i++)
		  {
			if (sequen1.charAt(i) == sequen2.charAt(i))
			{
			  num++;
			}
		  }
		  ratio = 1.0 * num / l1;
		  if (ratio > x)
		  {
			System.out.print("yes");
		  }
		  else
		  {
			System.out.print("no");
		  }
		}
		return 0;
	}

}

