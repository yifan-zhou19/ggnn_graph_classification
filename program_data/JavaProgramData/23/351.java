import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String temp = new String(new char[10000]);
		char[][] word = new char[100][20];
		temp = new Scanner(System.in).nextLine();
		int[] space = new int[100];
		int i;
		int num_of_space = 0;
		int j;
		int k;
		int end;

		for (i = 0; temp.charAt(i) != '\0'; i++)
		{
			;
		}
		end = i; //    ?????
		for (i = 0; i < end; i++) //??????
		{
			if (temp.charAt(i) == ' ')
			{
				num_of_space++;
				space[num_of_space] = i;

			}
		}

		if (num_of_space != 0)
		{
		for (i = 0; i < space[1]; i++)
		{
			word[0][i] = temp.charAt(i);
		}
		word[0][i] = '\0';

		for (i = 1; i < num_of_space; i++)
		{
			for (j = 0; space[i] + j + 1 < space[i + 1];j++)
			{
				word[i][j] = temp.charAt(space[i] + j + 1);
			}
			word[i][j] = '\0';
		}

		for (i = space[num_of_space] + 1 ; i < end; i++)
		{
			word[num_of_space][i - space[num_of_space] - 1] = temp.charAt(i);
		}

		word[num_of_space][i - space[num_of_space] - 1] = '\0';

		System.out.print(word[num_of_space]);

		for (i = num_of_space-1; i >= 0; i--)
		{
			System.out.print(' ');
			System.out.print(word[i]);
		}

		System.out.print("\n");
		}

		else
		{
			System.out.print(temp);
			System.out.print("\n");
		}


		return 0;
	}

}
