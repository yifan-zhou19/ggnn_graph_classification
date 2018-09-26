import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String come = new String(new char[110000]);
		String go = new String(new char[110000]);
		come = new Scanner(System.in).nextLine();
		go = new Scanner(System.in).nextLine();
		int x = 1;
		int i;
		int j = 1;
		int people = 1;
		int size = come.length();
		for (i = 0;i < size;i++)
		{
			if (come.charAt(i) == ',')
			{
			  people++;
			}
		}
			System.out.print(people);
		int[] come1 = new int[1000];
		int[] go1 = new int[1000];
		come1[0] = Integer.parseInt(come);
		for (i = 0;i < size;i++)
		{
			if (come.charAt(i) == ',')
			{
				come1[j] = Integer.parseInt(come.Substring(i) + 1);
				j++;
			}
		}
		j = 1;
		size = go.length();
		go1[0] = Integer.parseInt(go);
		for (i = 0;i < size;i++)
		{
			if (go.charAt(i) == ',')
			{
				go1[j] = Integer.parseInt(go.Substring(i) + 1);
				j++;
			}
		}
		int max = 0;
		for (i = 0;i <= 1000;i++)
		{
			int number = 0;
			for (j = 0;j < people;j++)
			{
				if (i >= come1[j] != 0 && i < go1[j])
				{
					number++;
				}
			}
			if (number > max)
			{
				max = number;
			}
		}

		System.out.print(' ');
		System.out.print(max);
		return 0;

	}



}
