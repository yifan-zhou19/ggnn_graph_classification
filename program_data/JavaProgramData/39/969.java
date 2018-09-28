public class student
{
	   public String name = new String(new char[21]);
	   public int qimo;
	   public int maji;
	   public char ganbu;
	   public char xibu;
	   public int lun;
	   public int money;
}

package <missing>;

public class GlobalMembers
{
	public static student[] st = tangible.Arrays.initializeWithDefaultstudentInstances(101);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int ans = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(st,0,sizeof(student));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			st[i].name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			st[i].qimo = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			st[i].maji = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			st[i].ganbu = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			st[i].xibu = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			st[i].lun = Integer.parseInt(tempVar7);
		}
		}
		for (i = 1;i <= n;i++)
		{
			if (st[i].qimo > 80 && st[i].lun >= 1)
			{
				st[i].money += 8000;
			}
		 if (st[i].qimo > 85 && st[i].maji > 80)
		 {
			 st[i].money += 4000;
		 }
		 if (st[i].qimo > 90)
		 {
			 st[i].money += 2000;
		 }
		 if (st[i].qimo > 85 && st[i].xibu == 'Y')
		 {
			 st[i].money += 1000;
		 }
		 if (st[i].maji > 80 && st[i].ganbu == 'Y')
		 {
			 st[i].money += 850;
		 }
		}
		 j = 1;
		 for (i = 1;i <= n;i++)
		 {
			 if (st[j].money < st[i].money)
			 {
				 j = i;
			 }
		 ans += st[i].money;
		 }
		 System.out.printf("%s\n%d\n%d",st[j].name,st[j].money,ans);
		 return 0;
	}
}

