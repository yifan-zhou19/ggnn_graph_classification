public class book
{
	public int id;
	public String str = new String(new char[27]);
}
public class people
{
	public int name;
	public int number;
	public int[] book_number = new int[1000];
}

package <missing>;

public class GlobalMembers
{
	public static book[] bo = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static people[] people = tangible.Arrays.initializeWithDefaultpeopleInstances(26);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int max = 0;
		final String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			bo[i].id = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			bo[i].str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < 26;i++) //???
		{
			people[i].number = 0;
		}
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(bo[i].str).length();
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < 26;k++) //???????????
				{
					if (bo[i].str.charAt(j) == a.charAt(k))
					{
						people[k].book_number[people[k].number] = bo[i].id;
						people[k].number++;
					}
				}
			}
		}
		j = 0;
		for (i = 0;i < 26;i++) //?????????
		{
			if (people[i].number > max)
			{
				j = i;
				max = people[i].number;
			}
		}
		System.out.print(a.charAt(j));
		System.out.print("\n");
		System.out.print(people[j].number);
		System.out.print("\n");
		for (i = 0;i < people[j].number;i++)
		{
			System.out.print(people[j].book_number[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

