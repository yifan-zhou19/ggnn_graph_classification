package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int l1;
	int l2;
	int s = 0;
	double r;
	double d;
	String s1 = new String(new char[max + 1]);
	String s2 = new String(new char[max + 1]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		s1 = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		s2 = tempVar3.charAt(0);
	}
	l1 = s1.length();
	l2 = s2.length();
	if (l1 != l2)
	{
				System.out.print("error");

				return 0;
	}
				else
				{
					for (int i = 0;i < l1;i++)
					{
						if ((s1.charAt(i) != 'A' && s1.charAt(i) != 'G' && s1.charAt(i) != 'C' && s1.charAt(i) != 'T') || (s2.charAt(i) != 'A' && s2.charAt(i) != 'G' && s2.charAt(i) != 'C' && s2.charAt(i) != 'T'))
						{
										  System.out.print("error");

										  return 0;
						}
					}
							 for (int j = 0;j < l1;j++)
							 {
							  if (s1.charAt(j) == s2.charAt(j))
							  {
								  s++;
							  }
							 }
								  d = 1.0 * s / l1;
								  if (d > r)
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

