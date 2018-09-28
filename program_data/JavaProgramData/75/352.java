import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*        ?????
	??????           2010.11.24    */
	public static int Main()
	{
		int i;
		int j;
		int num;
		int max;
		int[] count = new int[1000];
		int[] x = new int[10000];
		int[] y = new int[10000];
		final String ent = "";
		final String exi = "";
		ent = new Scanner(System.in).nextLine();
		exi = new Scanner(System.in).nextLine();
		//cout<<ent<<endl;
		i = 0;
		j = 0;
		while (j < ent.length())
		{
			if (ent.charAt(j) != ',')
			{
				x[i] = 10 * x[i] + ent.charAt(j) - '0';
				j++;
			}
			else
			{
				j++;
				i++;
			}
		}
		i = 0;
		j = 0;
		while (j < exi.length())
		{
			if (exi.charAt(j) != ',')
			{
				y[i] = 10 * y[i] + exi.charAt(j) - '0';
				j++;
			}
			else
			{
				j++;
				i++;
			}
		}
		//cout<<x[0]<<123<<y[0]<<endl;
		num = i + 1;
		for (i = 0;i < num;i++)
		{
			for (j = x[i];j < y[i];j++)
			{
				count[j]++;
			}
		}
		max = count[0];
		for (i = 1;i < 1000;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}
