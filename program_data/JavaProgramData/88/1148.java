import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int[] flag = new int[40];
		int[] start = new int[40];
		int[] end = new int[40];
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		int count = 0;
		if (a.charAt(i) > '0' && a.charAt(i) < '9')
		{
							   flag[i] = 1;
							   start[1] = 0;
		}
		else
		{
			flag[i] = 0;
		}
		for (i = 1;i <= 30;i++)
		{
					  if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
					  {
											 flag[i] = 1;

					  }
					  else
					  {
						  flag[i] = 0;
					  }
					  if (flag[i - 1] == 0 && flag[i] == 1)
					  {
												   start[count + 1] = i;
					  }
					  if (flag[i - 1] == 1 && flag[i] == 0)
					  {
												  count++;
												  end[count] = i - 1;
					  }

		}
		for (i = 1;i <= count;i++)
		{
							 for (j = start[i];j <= end[i];j++)
							 {
														  System.out.print(a.charAt(j));
							 }
							 if (i != count)
							 {
								 System.out.print("\n");
							 }
		}
		return 0;

	}

}
