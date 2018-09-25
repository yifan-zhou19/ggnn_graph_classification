import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String time1 = new String(new char[10000]);
		String time2 = new String(new char[10000]);
		int[] timein = new int[1000];
		int[] timeout = new int[1000];
		int[] sta = new int[1000];
		int i;
		int j = 0;
		int k;
		int flag = 0;
		int max = 0;
		int people = 0;
		time1 = new Scanner(System.in).nextLine(); //???????????
		time2 = new Scanner(System.in).nextLine(); //???????????
		for (i = 0;i < 10000;i++) //????
		{
			if (time1.charAt(i) == ',')
			{
				people++;
			}
			else if (time1.charAt(i) == '\0')
			{
				break;
			}
		}
		if (people != 0)
		{
			people++;
		}
		for (i = 0;i < 1000;i++) //???
		{
			timein[i] = -1;
			timeout[i] = -1;
			sta[i] = 0;
		}
		for (i = 0;i < 10000;i++) //?????????????????
		{
			if (time1.charAt(i) == ',')
			{
				timein[j] = 0;
				for (k = i - 1;k >= flag;k--)
				{

					timein[j] = timein[j] + (time1.charAt(k) - '0') * (int)Math.pow(10.0,(double)(i - 1 - k));
				}
				flag = i + 1;
				j++;
			}
			else if (time1.charAt(i) == '\0')
			{
				timein[j] = 0;
				for (k = i - 1;k >= flag;k--)
				{

					timein[j] = timein[j] + (time1.charAt(k) - '0') * (int)Math.pow(10.0,(double)(i - 1 - k));
				}
				break;
			}
		}
		flag = 0;
		j = 0;

		for (i = 0;i < 10000;i++) //?????????????????
		{
			if (time2.charAt(i) == ',')
			{
				timeout[j] = 0;
				for (k = i - 1;k >= flag;k--)
				{

					timeout[j] = timeout[j] + (time2.charAt(k) - '0') * (int)Math.pow(10.0,(double)(i - 1 - k));
				}
				flag = i + 1;
				j++;
			}
			else if (time2.charAt(i) == '\0')
			{
				timeout[j] = 0;
				for (k = i - 1;k >= flag;k--)
				{

					timeout[j] = timeout[j] + (time2.charAt(k) - '0') * (int)Math.pow(10.0,(double)(i - 1 - k));
				}
				break;
			}
		}

		for (i = 0;i < 1000;i++) //??????????
		{
			if (timein[i] != -1)
			{
				for (k = timein[i];k < timeout[i];k++)
				{
					sta[k]++;
				}
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < 1000;i++) //???????????
		{
			if (sta[i] > max)
			{
				max = sta[i];
			}
		}
		System.out.print(people);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}
