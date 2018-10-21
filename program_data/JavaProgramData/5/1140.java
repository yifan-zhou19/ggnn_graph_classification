package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s1 = new String(new char[501]);
	String s2 = new String(new char[502]);
	int l1;
	int l2;
	int i;
	double std;
	double aa;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		std = Double.parseDouble(tempVar);
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
	l1 = s1.length();
	l2 = s2.length();
	aa = -1;
	if (l1 == l2)
	{
	aa = 0;
	   for (i = 0;i < l1;i++)
	   {
		if (s1.charAt(i) == s2.charAt(i))
		{
			aa++;
		}
		if (s1.charAt(i) != 'A' && s1.charAt(i) != 'C' && s1.charAt(i) != 'T' && s1.charAt(i) != 'G')
		{
			aa = -1;
			break;
		}
		if (s2.charAt(i) != 'A' && s2.charAt(i) != 'C' && s2.charAt(i) != 'T' && s2.charAt(i) != 'G')
		{
			aa = -1;
			break;
		}
	   }
	}
	if (aa == -1)
	{
		System.out.print("error");
	}
	else
	{
	 aa = aa / l1;
	 if (aa > std)
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

