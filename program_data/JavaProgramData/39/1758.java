//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int tgra;
	public String name = new String(new char[21]);
	public int cgra;
	public char statue;
	public char west;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] stu = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(100);

	public static void Main()
	{
		int N;
		int i;
		int j;
		int q;
		int[] scholar = new int[100];
		int temp;
		int n = 1;
		int total = 0;
		String media = new String(new char[21]);
		char a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			for (j = 0;(a = System.in.read()) != ' ';j++)
			{
				stu[i].name = tangible.StringFunctions.changeCharacter(stu[i].name, j, a);
			}
			stu[i].name = tangible.StringFunctions.changeCharacter(stu[i].name, j, '\0');
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].tgra = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].cgra = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar4 != null)
			{
				stu[i].statue = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].west = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar6);
			}
		}
		for (i = 0;i < N;i++)
		{
			if ((stu[i].tgra > 80) && (stu[i].paper >= 1))
			{
				scholar[i] = scholar[i] + 8000;
			}
			if ((stu[i].tgra > 85) && (stu[i].cgra > 80))
			{
				scholar[i] = scholar[i] + 4000;
			}
			if (stu[i].tgra > 90)
			{
				scholar[i] = scholar[i] + 2000;
			}
			if (stu[i].tgra > 85 && stu[i].west == 'Y')
			{
				scholar[i] = scholar[i] + 1000;
			}
			if (stu[i].cgra > 80 && stu[i].statue == 'Y')
			{
				scholar[i] = scholar[i] + 850;
			}
		}
		q = 0;
		for (j = 1;j < N;j++)
		{
			if (scholar[q] < scholar[j])
			{
					q = j;
			}
		}
		//puts(stu[0].name);
		for (i = 0;i < String.valueOf(stu[q].name).length();i++)
		{
			if (stu[q].name.charAt(i) != 10)
			{
				System.out.printf("%c",stu[q].name.charAt(i));
			}
		}
		System.out.printf("\n%d\n",scholar[q]);
		for (i = 0;i < N;i++)
		{
			total = total + scholar[i];
		}
		System.out.printf("%d\n",total);
	}



}

