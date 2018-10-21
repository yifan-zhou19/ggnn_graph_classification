package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] number1 = new int[100]; //????
		int[] number2 = new int[100];
		int len1 = 0;
		int len2 = 0;
		len1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		void getarray(int number[],int len);
		void rank(int number[],int len);
		void add(int number1[],int number2[],int len1,int len2);
		void print(int number[],int len1,int len2);
		getarray(number1, len1); //????????
		getarray(number2, len2);
		rank(number1, len1); //??????????
		rank(number2, len2);
		add(number1, number2, len1, len2); //?????????
		print(number1, len1, len2); //????????
		return 0;
	}
	public static void getarray(int[] number, int len)
	{
		int i = 0;
		for (i = 0;i < len;i++)
		{
			number[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void rank(int[] number, int len)
	{
		int i; //i,j?????,temp?????
		int j;
		int temp;
		for (i = 0;i < len;i++) //??
		{
			for (j = i + 1;j < len;j++)
			{
				if (number[i] > number[j])
				{
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
	}
	public static void add(int[] number1, int[] number2, int len1, int len2)
	{
		int i = 0; //i?????
		for (i = 0;i < len2;i++)
		{
			number1[i + len1] = number2[i];
		}
	}
	public static void print(int[] number, int len1, int len2)
	{
		int i;
		for (i = 0;i < len1 + len2 - 1;i++)
		{
			System.out.print(number[i]);
			System.out.print(' ');
		}
		System.out.print(number[len1 + len2 - 1]);
	}
}

