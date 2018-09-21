package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String sentense = new String(new char[300]);
		sentense = new Scanner(System.in).nextLine();
		sentense = tangible.StringFunctions.changeCharacter(sentense, sentense.length(), ' ');
		int[] num = new int[300];
		int i = 0;
		int a = 0;
		while (i <= sentense.length())
		{
			if (sentense.charAt(i) == ' ')
			{
				a++;
				i++;
			}
			else
			{
				num[a]++;
				i++;
			}
		}
		int max = 0;
		int min = 0;
		for (i = 0;i < a;i++)
		{
			if (num[i] > num[max])
			{
				max = i;
			}
			if (num[i] < num[min])
			{
				min = i;
			}
		}
		String l = new String(new char[300]);
		String s = new String(new char[300]);
		int sum1 = 0;
		int sum2 = 0;
		int j = 0;
		int k = 0;
		for (i = 0;i <= max;i++)
		{
			sum1 += num[i] + 1;
		}
		for (i = 0;i <= min;i++)
		{
			sum2 += num[i] + 1;
		}
		for (i = sum1 - num[max] - 1;i < sum1 - 1;i++)
		{
			l = tangible.StringFunctions.changeCharacter(l, j, sentense.charAt(i));
			j++;
		}
		l = tangible.StringFunctions.changeCharacter(l, j, '\0');
		for (i = sum2 - num[min] - 1;i < sum2 - 1;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, k, sentense.charAt(i));
			k++;
		}
		s = tangible.StringFunctions.changeCharacter(s, k, '\0');
		System.out.printf("%s\n%s\n",l,s);
	}


}

