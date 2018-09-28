package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int len1;
		int len2;
		int temp = 0;
		String str1 = new String(new char[600]);
		String str2 = new String(new char[600]);
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str2 = tempVar3.charAt(0);
		}
		len1 = str1.length();
		len2 = str2.length();
		if (len1 != len2)
		{
		  System.out.print("error");
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				if ((str1.charAt(i) != 'A' && str1.charAt(i) != 'T' && str1.charAt(i) != 'C' && str1.charAt(i) != 'G') || (str2.charAt(i) != 'A' && str2.charAt(i) != 'T' && str2.charAt(i) != 'C' && str2.charAt(i) != 'G'))
				{
				  System.out.print("error");
				  temp = 1;
				  break;

				}
				if (str1.charAt(i) == str2.charAt(i))
				{
				  k++;
				}
			}
			if (temp == 0)
			{

			  if (k * 1.0 / len1 > p)
			  {
			  System.out.print("yes");
			  }
			  else if (k * 1.0 / len1 <= p)
			  {
			   System.out.print("no");
			  }
			}
		}






		return 0;
	}
}

