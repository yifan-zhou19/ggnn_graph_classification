import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int judge = char a[]; //???????????????
		int n;
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //???????
		for (int j = 1;j <= n;j++) //??n????
		{
		   String a = new String(new char[85]);
		   for (i = 0;i < 85;i++)
		   {
			   a = a.substring(0, i);
		   }

		   a = new Scanner(System.in).nextLine();
		   b[j] = judge(a); //??????????????b

		   for (i = 0;i < 85;i++)
		   {
			   a = a.substring(0, i); //???????
		   }

		}
		for (i = 1;i <= n;i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}

		return 0;

	}
	public static int judge(String a) //???????????????
	{
		int i;
		for (i = 0;i < 85;i++) //??????????
		{
			if (a[i].equals(' '))
			{
				return 0;
				break;
			}
		}
		if (((int)a[0] >= 97 && (int)a[0] <= 122) || ((int)a[0] >= 65 && (int)a[0] <= 90) || (int)a[0] == 95)
		{
			for (i = 1;i < 85;i++)
			{
				if (((int)a[i] >= 1 && (int)a[i] <= 47) || ((int)a[i] >= 58 && (int)a[i] <= 64) || ((int)a[i] >= 91 && (int)a[i] <= 94) || (int)a[i] == 96 || (int)a[i] >= 123)
				{
					return 0;
					break;
				}

			}
			if (i == 85)
			{
				return 1;
			}
		}
		else
		{
			return 0;
		}
	}



}

