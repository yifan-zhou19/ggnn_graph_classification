import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] start1 = new int[10000];
		int[] end1 = new int[10000];
		int i = 0;
		int renshu = 0;
		int max = 0;
		int flag = 0;
		int flag1 = 0;
		int j = 0;
		int[] num = new int[100000];
		String start = new String(new char[200000]);
		String end = new String(new char[200000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(start1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(start,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(end,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(end1,0,(Integer.SIZE / Byte.SIZE));
		start = new Scanner(System.in).nextLine();
		end = new Scanner(System.in).nextLine();
		for (i = 0;i < 200000;i++)
		{
			if (start.charAt(i) == 0)
			{
				renshu++;
				flag = flag1;
				flag1 = i - 1;
				if (renshu == 1)
				{
					for (j = flag1;j >= 0;j--)
					{
						start1[renshu] = start1[renshu] + (start.charAt(j) - '0') * Math.pow((double)10,(double)(flag1 - j));
					}
				}
				else
				{
					for (j = flag1;j > flag + 1;j--)
					{
						start1[renshu] = start1[renshu] + (start.charAt(j) - '0') * Math.pow((double)10,(double)(flag1 - j));
					}
				}
				break;
			}
			if (start.charAt(i) != 0)
			{
				if (start.charAt(i) == ',')
				{
					renshu++;
					flag = flag1;
					flag1 = i - 1;
					if (renshu == 1)
					{
						for (j = flag1;j >= 0;j--)
						{
							start1[renshu] = start1[renshu] + (start.charAt(j) - '0') * Math.pow((double)10,(double)(flag1 - j));
						}
					}
					else
					{
						for (j = flag1;j > flag + 1;j--)
						{
							start1[renshu] = start1[renshu] + (start.charAt(j) - '0') * Math.pow((double)10,(double)(flag1 - j));
						}
					}
				}
			}
		}
		flag = 0;
		flag1 = 0;
		renshu = 0;
		for (i = 0;i < 200000;i++)
		{
			if (end.charAt(i) == 0)
			{
				renshu++;
				flag = flag1;
				flag1 = i - 1;
				if (renshu == 1)
				{
					for (j = flag1;j >= 0;j--)
					{
						end1[renshu] = end1[renshu] + (end.charAt(j) - '0') * Math.pow((double)10,(double)(flag1 - j));
					}
				}
				else
				{
					for (j = flag1;j > flag + 1;j--)
					{
						end1[renshu] = end1[renshu] + (end.charAt(j) - '0') * Math.pow((double)10,(double)(flag1 - j));
					}
				}
				break;
			}
			if (end.charAt(i) != 0)
			{
				if (end.charAt(i) == ',')
				{
					renshu++;
					flag = flag1;
					flag1 = i - 1;
					if (renshu == 1)
					{
						for (j = flag1;j >= 0;j--)
						{
							end1[renshu] = end1[renshu] + (end.charAt(j) - '0') * Math.pow((double)10,(double)(flag1 - j));
						}
					}
					else
					{
						for (j = flag1;j > flag + 1;j--)
						{
							end1[renshu] = end1[renshu] + (end.charAt(j) - '0') * Math.pow((double)10,(double)(flag1 - j));
						}
					}
				}
			}
		}
		for (i = 1;i <= renshu;i++)
		{
			for (j = start1[i];j < end1[i];j++)
			{
				num[j]++;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.print(renshu);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}
