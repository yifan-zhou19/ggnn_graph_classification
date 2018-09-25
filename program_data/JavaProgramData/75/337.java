import java.util.*;

package <missing>;

public class GlobalMembers
{
	//?????
	//??????
	//???2010.11.27

	public static int Main()
	{
		int i = 0;
		double j = 0.0;
		String a = new String(new char[10000]); //???a,b?????????","
		String b = new String(new char[10000]);
		int[] begin = new int[10000]; //?????????????begin,end?
		int[] end = new int[10000];
		int p = 0;
		int q = 0;
		int last_time = 0; //??last_time?????????
		int max = 0; //??max????????????
		int count = 0;
		int flag = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE)); //????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(begin,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(end,0,(Integer.SIZE / Byte.SIZE));

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();



		for (i = 0; i <= 10000; i++) //????????
		{
			if ((a.charAt(i) != ',') && (a.charAt(i) != '\0'))
			{
				flag++;
			}
			if ((a.charAt(i) == ',') || (a.charAt(i) == '\0'))
			{
				if (flag == 3) //???????????begin[i]???
				{
					begin[p++] = a.charAt(i - 1) - '0' + 10 * (a.charAt(i - 2) - '0') + 100 * (a.charAt(i - 3) - '0');
				}
				if (flag == 2)
				{
					begin[p++] = a.charAt(i - 1) - '0' + 10 * (a.charAt(i - 2) - '0');
				}
				if (flag == 1)
				{
					begin[p++] = a.charAt(i - 1) - '0';
				}
				flag = 0;
			}
			if (a.charAt(i) == '\0')
			{
				break;
			}
		}
		for (i = 0; i <= 10000; i++)
		{
			if ((b.charAt(i) != ',') && (b.charAt(i) != '\0'))
			{
				flag++;
			}
			if ((b.charAt(i) == ',') || (b.charAt(i) == '\0'))
			{
				if (flag == 3)
				{
					end[q++] = b.charAt(i - 1) - '0' + 10 * (b.charAt(i - 2) - '0') + 100 * (b.charAt(i - 3) - '0');
				}
				if (flag == 2)
				{
					end[q++] = b.charAt(i - 1) - '0' + 10 * (b.charAt(i - 2) - '0');
				}
				if (flag == 1)
				{
					end[q++] = b.charAt(i - 1) - '0';
				}
				flag = 0;
			}
			if (b.charAt(i) == '\0')
			{
				break;
			}
		}

		for (i = 0; i <= p - 1; i++) //?????????
		{
			if (end[i] > last_time)
			{
				last_time = end[i];
			}
		}
		for (j = 0.5; j <= last_time - 0.5; j++) //????????????
		{
			count = 0;
			for (i = 0; i <= p - 1; i++)
			{
				if ((begin[i] < j) && (end[i] > j))
				{
					count++;
				}
			}
			if (count > max)
			{
				max = count;
			}
		}

		System.out.print(p);
		System.out.print(" ");
		System.out.print(max);
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		return 0;
	}
}

