public class st
{
		public String name = new String(new char[25]);
		public int[] sc = new int[2];
		public char leader;
		public char west;
		public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		st[] s = tangible.Arrays.initializeWithDefaultstInstances(200);
		int n;
		int i;
		int j = 0;
		int max = 0;
		int sum = 0;
		int[] a = new int[200];
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
				s[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].sc[0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].sc[1] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				s[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i].sc[0] > 80 && s[i].paper > 0)
			{
				a[i] = a[i] + 8000;
			}
			if (s[i].sc[0] > 85 && s[i].sc[1] > 80)
			{
				a[i] = a[i] + 4000;
			}
			if (s[i].sc[0] > 90)
			{
				a[i] = a[i] + 2000;
			}
			if (s[i].sc[0] > 85 && s[i].west == 'Y')
			{
				a[i] = a[i] + 1000;
			}
			if (s[i].sc[1] > 80 && s[i].leader == 'Y')
			{
				a[i] = a[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			j = (a[i] > max)? i:j;
			max = (a[i] > max)? a[i]:max;
			sum = sum + a[i];
		}
		System.out.printf("%s\n%d\n%d",s[j].name,a[j],sum);
	}
}

