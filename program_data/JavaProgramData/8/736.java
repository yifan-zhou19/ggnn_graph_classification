package <missing>;

public class GlobalMembers
{
	public static int getin(int[] array, int num)
	{
		for (int i = 0;i < num;i++)
		{
			array[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return (array[num]);
	}
	public static int sort(int[] array, int num)
	{
		int temp;
		for (int i = 0;i < num - 1;i++)
		{
			for (int j = 0;j < num - i - 1;j++)
			{
				if (array[j] > array[j + 1])
				{
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array[num];
	}
	public static int link(int[] array1, int[] array2, int num1, int num2)
	{
		System.out.print(array1[0]);
		for (int i = 1;i < num1;i++)
		{
			System.out.print(" ");
			System.out.print(array1[i]);
		}
		for (int i = 0;i < num2;i++)
		{
			System.out.print(" ");
			System.out.print(array2[i]);
		}
		return 0;
	}
	public static int Main()
	{
		int numa;
		int numb;
		int[] a = new int[1000];
		int[] b = new int[1000];
		numa = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		numb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		getin(a, numa);
		getin(b, numb);
		sort(a, numa);
		sort(b, numb);
		link(a, b, numa, numb);
		return 0;
	}





}

