//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int step = 0;
	public static int length = 0;
	public static int a = 0;
	public static int[] sang = new int[101];
	public static void buqi(int[] num1, int[] num2)
	{
		int i;
		num2[0] = 1;
		num2[1] = 3;
		num2[2] = 0;
		if (num1[0] > num2[0] || (num1[0] == num2[0] && num1[1] >= num2[1]))
		{
			i = 1;
		}
		else
		{
			a++;
			num2[0] = 0;
			num2[1] = 1;
			num2[2] = 3;
			//cout<<a<<endl;
		}
	}
	public static void qingling(int[] num3, int[] num6)
	{
		int i;
		int j;
		for (i = 0;i < length;i++)
		{
			if (num3[i] != 0)
			{
				break;
			}
		}
		for (j = 0;j < length - i;j++)
		{
			num3[j] = num3[j + i];
		}
		for (j = length - i;j < length;j++)
		{
			num3[j] = 0;
		}
		length = length - i;
		//cout<<length<<endl;
		if (num6[0] != 0)
		{
			a = a + i - 1;
		}
		else
		{
			a = a + i - 2;
		}
		//cout<<a<<endl;
	}
	public static void jianfa(int[] num4, int[] num5, int i)
	{
		int j;
		while (true)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (num4[j] >= num5[j])
				{
					num4[j] = num4[j] - num5[j];
					//cout<<num4[j]<<" ";
				}
				else
				{
					num4[j - 1] = num4[j - 1] - 1;
					num4[j] = num4[j] + 10;
					num4[j] = num4[j] - num5[j];
					//cout<<num4[j]<<" ";
				}
			}
			//cout<<endl;
			if (num5[0] == 1)
			{
				if (num4[0] > num5[0] || (num4[0] == num5[0] && num4[1] >= num5[1]))
				{
					j = j;
				}
				else
				{
					break;
				}
			}
			else
			{
				if (num4[0] > num5[0] || num4[1] > num5[1] || (num4[1] == num5[1] && num4[2] >= num5[2]))
				{
					j = j;
				}
				else
				{
					break;
				}
			}

			step++;
		}
	}
	public static int Main()
	{
		final String str1 = "";
		int[] num1 = new int[101];
		int[] num2 = new int[101];
		int i;
		int weishu;
		int biaoji = 0;
		int j;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = str1.length();
		weishu = length;
		for (i = 0;i < length;i++)
		{
			num1[i] = str1.charAt(i) - '0';
		}
		while (true)
		{
			step = 0;
			if (length == 1)
			{
				break;
			}
			buqi(num1, num2);
			if (length == 2 && num2[0] == 0)
			{
				num1[0] = num1[0] * 10 + num1[1];
				sang[a] = 0;
				break;
			}
			else
			{
				jianfa(num1, num2, length);
				biaoji = 0;
				for (i = 0;i < weishu;i++)
				{
					if (num1[i] != 0)
					{
						biaoji = 1;
						break;
					}
				}
				sang[a] = step + 1;
				//cout<<a<<" "<<sang[a]<<" "<<endl;
				if (biaoji == 1)
				{
					qingling(num1, num2);
				}
				else
				{
					break;
				}
			}
			a++;
		}
		if (weishu > 1)
		{
			for (i = 0;i < weishu - 1;i++)
			{
				if (sang[i] != 0)
				{
					break;
				}
			}
			if (i == weishu - 1)
			{
				System.out.print(sang[0]);
			}
			else
			{
				for (j = i;j < weishu - 1;j++)
				{
					System.out.print(sang[j]);
				}
			}
		}
		else
		{
			System.out.print(sang[0]);
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


