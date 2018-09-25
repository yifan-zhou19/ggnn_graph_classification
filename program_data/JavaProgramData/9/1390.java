public class kb
{
	public String ID = new String(new char[10]);
	public int nl;
}

package <missing>;

public class GlobalMembers
{
	public static kb[] kbr = tangible.Arrays.initializeWithDefaultkbInstances(100);
	public static kb[] lnr = tangible.Arrays.initializeWithDefaultkbInstances(100);
	public static kb ln = new kb();

	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int l;
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
				kbr[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				kbr[i].nl = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (kbr[i].nl >= 60)
			{
				lnr[k].ID = kbr[i].ID;
				lnr[k].nl = kbr[i].nl;
				k++;
				kbr[i].ID = "000000000";
			}
		}
		for (i = 1;i < k;i++)
		{
			for (l = 0;l < k - i;l++)
			{
				if (lnr[l].nl < lnr[l + 1].nl)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: ln=lnr[l+1];
					ln.copyFrom(lnr[l + 1]);
					lnr[l + 1] = lnr[l];
					lnr[l] = ln;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",lnr[i].ID);
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(kbr[i].ID,"000000000") == 1)
			{
				System.out.printf("%s\n",kbr[i].ID);
			}
		}
		return 0;
	}

}

