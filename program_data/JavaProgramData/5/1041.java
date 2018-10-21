package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[501]);
		String s2 = new String(new char[501]);
	double p;
	double q;
		int m;
		int n;
		int j;
		int k = 0;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   p = Double.parseDouble(tempVar);
		   }

				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s1 = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s2 = tempVar3.charAt(0);
				}
		  m = s1.length();
		  n = s2.length();
					for (j = 0;s1.charAt(j),s2.charAt(j);j++)
					{
				if (!(s1.charAt(j) == 'A' || s1.charAt(j) == 'T' || s1.charAt(j) == 'G' || s1.charAt(j) == 'C') || !(s2.charAt(j) == 'A' || s2.charAt(j) == 'T' || s2.charAt(j) == 'G' || s2.charAt(j) == 'C') || m != n)
				{
					k = m + 1;
				break;
				}
				else if (s1.charAt(j) == s2.charAt(j))
				{
					k++;
				}


					}
		 q = 1.0 * k / m;
		 if (k == m + 1)
		 {
			 System.out.print("error");
		 }
		else if (q > p)
		{
				System.out.print("yes");
		}
			else if (q <= p)
			{
				System.out.print("no");
			}






		 return 0;
	}

}

