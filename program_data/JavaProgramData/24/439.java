package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		final String word = "";
	int max = 0;
	int min = 0;
	int flag = 0;
	int i;
	int j = -1;
	int k = 0;
	int n;
	int numa;
	int num;
	a = new Scanner(System.in).nextLine();
	numa = a.length();
	for (i = 0;i < numa;i++)
	{
		if (a.charAt(i) == ' ')
		{
		flag = 0;
	k = 0;
		}
	else if (a.charAt(i) != ' ' && flag == 0)
	{
		j++;
		word.charAt(j)[k] = a.charAt(i);

	k++;
	flag = 1;
	}
	else if (a.charAt(i) != ' ' && flag == 1)
	{
		word.charAt(j)[k] = a.charAt(i);
	k++;
	}
	}

	for (i = 1;i <= j;i++)
	{
		if (String.valueOf(word.charAt(max)).length() < String.valueOf(word.charAt(i)).length())
		{
	max = i;
		}
	if (String.valueOf(word.charAt(min)).length() > String.valueOf(word.charAt(i)).length())
	{
	min = i;
	}
	}

	System.out.println(word.charAt(max));
	System.out.println(word.charAt(min));
	}
}
