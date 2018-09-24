public class student
{
	public int num;
 public String s = new String(new char[26]);

}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(999);

	public static int Main()
	{
		int m;
		int[] a = new int[26];
		int i;
		int j;
		int max;
		int k;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			stu[i].num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			stu[i].s = tempVar3.charAt(0);
		}
		}
		for (i = 0;i < 26;i++)
		{
		for (k = 0;k < m;k++)
		{
		   for (j = 0;j < String.valueOf(stu[k].s).length();j++)
		   {
			   if (stu[k].s.charAt(j) == 'A' + i)
			   {
				   a[i]++;
			   }
		   }
		}
		}

		   max = a[0];
		for (i = 1;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				l = i;
			}
		}
			System.out.printf("%c\n",'A' + l);
			System.out.printf("%d\n",max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(stu[i].s).length();j++)
			{
			   if (stu[i].s.charAt(j) == 'A' + l)
			   {
				   System.out.printf("%d\n",stu[i].num);
			   break;
			   }
			}
		}


		return 0;
	}


}

