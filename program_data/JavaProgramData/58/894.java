import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int sign;
		char[][] vacab = new char[100][100];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = char x[100];
		System.in.read();
		for (i = 0;i < num;i++)
		{
		   vacab[i] = new Scanner(System.in).nextLine();
		   sign = sum(vacab[i]);
		   if (sign == 1)
		   {
		   System.out.print(1);
		   System.out.print("\n");
		   }
		   else
		   {
		   System.out.print(0);
		   System.out.print("\n");
		   }
		}
		return 0;
	}
	public static int sum(String x)
	{
			int j = 0;
			int temp;
			j = 0;
			if (x[0].equals('_') || x[0].compareTo('A') >= 0 && x[0].compareTo('Z') <= 0 || x[0].compareTo('a') >= 0 && x[0].compareTo('z') <= 0)
			{
				while (!x[j].equals('\0'))
				{
					if (x[j].equals('_') || x[j].compareTo('A') >= 0 && x[j].compareTo('Z') <= 0 || x[j].compareTo('a') >= 0 && x[j].compareTo('z') <= 0 || x[j].compareTo('0') >= 0 && x[j].compareTo('9') <= 0)
					{
						temp = 1;
						j++;
					}
					else
					{
						temp = 0;
						break;
					}
				}
			}
			else
			{
				temp = 0;
			}
			return (temp);
	}
}

