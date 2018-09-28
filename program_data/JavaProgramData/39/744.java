public class student
{
	public String name = new String(new char[20]);
	public int test;
	public int term;
	public char key;
	public char west;
	public int art;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static student[] person = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int q = 0;
		int k;
		student temp = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				person[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				person[i].test = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				person[i].term = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				person[i].key = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				person[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				person[i].art = Integer.parseInt(tempVar7);
			}
			person[i].money = 0;
			if (person[i].art > 0 && person[i].test > 80)
			{
				person[i].money = person[i].money + 8000;
			}
			if (person[i].test > 85 && person[i].term > 80)
			{
				person[i].money = person[i].money + 4000;
			}
			if (person[i].test > 90)
			{
				person[i].money = person[i].money + 2000;
			}
			if (person[i].test > 85 && person[i].west == 'Y')
			{
				person[i].money = person[i].money + 1000;
			}
			if (person[i].term > 80 && person[i].key == 'Y')
			{
				person[i].money = person[i].money + 850;
			}
			q = q + person[i].money;
		}
		for (i = 0;i <= n - 2;i++)
		{
			k = i;
			for (j = i + 1;j <= n - 1;j++)
			{
				if (person[j].money > person[k].money)
				{
					k = j;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=person[k];
			temp.copyFrom(person[k]);
			person[k] = person[i];
			person[i] = temp;
		}
		System.out.printf("%s\n",person[0].name);
		System.out.printf("%d\n",person[0].money);
		System.out.printf("%d",q);
		return 0;
	}

}

