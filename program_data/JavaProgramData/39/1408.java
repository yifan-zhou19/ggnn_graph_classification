public class student
{
	public String name = new String(new char[20]);
	public int grade;
	public int mark_class;
	public char monitor;
	public char west;
	public int paper;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static int c_to_d(String c)
	{
		int n = c.length();
		int i;
		int x = 0;

			for (i = 0;i < n;i++)
			{
				x = x * 10 + c[i] - 48;
			}
		return x;
	}

	public static void Main()
	{
		int n;
		int len;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		int i;
		int j;
		int k;
		int l;
		int m;
		int total = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();

		for (i = 0;i < n;i++)
		{
			String help = new String(new char[35]);
			help = new Scanner(System.in).nextLine();
			len = help.length();

			for (j = 0;;j++)
			{
				if (help.charAt(j) == ' ')
				{
					stu[i].name = tangible.StringFunctions.changeCharacter(stu[i].name, j, '\0');
					break;
				}
				stu[i].name = tangible.StringFunctions.changeCharacter(stu[i].name, j, help.charAt(j));
			}
			j++;

			for (k = 0;;k++)
			{
				String help2 = new String(new char[3]);
				if (help.charAt(j + k) == ' ')
				{
					help2 = tangible.StringFunctions.changeCharacter(help2, k, '\0');
					stu[i].grade = c_to_d(help2);
					break;
				}
				help2 = tangible.StringFunctions.changeCharacter(help2, k, help.charAt(j + k));
			}
			k++;

			for (l = 0;;l++)
			{
				String help2 = new String(new char[3]);
				if (help.charAt(j + k + l) == ' ')
				{
					help2 = tangible.StringFunctions.changeCharacter(help2, l, '\0');
					stu[i].mark_class = c_to_d(help2);
					break;
				}
				help2 = tangible.StringFunctions.changeCharacter(help2, l, help.charAt(j + k + l));
			}
			l++;

			stu[i].monitor = help.charAt(j + k + l);
			stu[i].west = help.charAt(j + k + l + 2);

			for (m = 0;;m++)
			{
				String help2 = new String(new char[3]);
				if (len == (j + k + l + 4 + m))
				{
					help2 = tangible.StringFunctions.changeCharacter(help2, m, '\0');
					stu[i].paper = c_to_d(help2);
					break;
				}
				help2 = tangible.StringFunctions.changeCharacter(help2, m, help.charAt(j + k + l + 4 + m));
			}
		}

		for (i = 0;i < n;i++)
		{
			stu[i].money = 0;
			if (stu[i].grade > 80 && stu[i].paper > 0)
			{
				stu[i].money += 8000;
			}
			if (stu[i].grade > 85 && stu[i].mark_class > 80)
			{
				stu[i].money += 4000;
			}
			if (stu[i].grade > 90)
			{
				stu[i].money += 2000;
			}
			if (stu[i].grade > 85 && stu[i].west == 'Y')
			{
				stu[i].money += 1000;
			}
			if (stu[i].mark_class > 80 && stu[i].monitor == 'Y')
			{
				stu[i].money += 850;
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (stu[j].money < stu[j + 1].money)
				{
					student y = new student();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: y=stu[j];
					y.copyFrom(stu[j]);
					stu[j] = stu[j + 1];
					stu[j + 1] = y;
				}
			}
		}

		System.out.printf("%s\n%d\n",stu[0].name,stu[0].money);

		for (i = 0;i < n;i++)
		{
			total += stu[i].money;
		}
		System.out.printf("%d",total);
	}
}

