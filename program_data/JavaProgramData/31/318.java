public class people
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public String age = new String(new char[5]);
	public String score = new String(new char[10]);
	public String address = new String(new char[30]);
}

package <missing>;

public class GlobalMembers
{
	public static people[] child = tangible.Arrays.initializeWithDefaultpeopleInstances(1000);
	public static void Main()
	{
		int i;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				child[i].num = tempVar.charAt(0);
			}
			if (strcmp(child[i].num,"end") == 0)
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				child[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				child[i].sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				child[i].age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				child[i].score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				child[i].address = tempVar6.charAt(0);
			}
		}
		for (i--;i >= 0;i--)
		{
			System.out.printf("%s %s %c %s %s %s\n",child[i].num,child[i].name,child[i].sex,child[i].age,child[i].score,child[i].address);
		}
	}

}

