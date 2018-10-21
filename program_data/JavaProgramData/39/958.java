public class stu
{
	public String str0 = new String(new char[20]);
	public int gr1;
	public int gr2;
	public char is1;
	public char is2;
	public int lun;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int num(stu s)
	{
		if (s.gr1 > 80 && s.lun >= 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int num2(stu s)
	{
		if (s.gr1 > 85 && s.gr2 > 80)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int num3(stu s)
	{
		if (s.gr1 > 90)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int num4(stu s)
	{
		if (s.gr1 > 85 && s.is2 == 'Y')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int num5(stu s)
	{
		if (s.gr2 > 80 && s.is1 == 'Y')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		stu[] st = tangible.Arrays.initializeWithDefaultstuInstances(100);
		int n;
		int i;
		int max = 0;
		int tot = 0;
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
			  st[i].str0 = tempVar2.charAt(0);
		  }
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			st[i].gr1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			st[i].gr2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			st[i].is1 = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			st[i].is2 = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			st[i].lun = Integer.parseInt(tempVar7);
		}
		st[i].total = 0;
		if (num(st[i]) == 1)
		{
			st[i].total += 8000;
		}
		if (num2(st[i]) == 1)
		{
			st[i].total += 4000;
		}
		if (num3(st[i]) == 1)
		{
			st[i].total += 2000;
		}
		if (num4(st[i]) == 1)
		{
			st[i].total += 1000;
		}
		if (num5(st[i]) == 1)
		{
			st[i].total += 850;
		}
		}
		for (i = 0;i < n;i++)
		{
			tot += st[i].total;
			if (max < st[i].total)
			{
				max = st[i].total;
			}
		}
		 for (i = 0;i < n;i++)
		 {
			 if (st[i].total == max)
			 {
				 System.out.printf("%s\n%d\n%d",st[i].str0,max,tot);
			 break;
			 }
		 }

	}

}

