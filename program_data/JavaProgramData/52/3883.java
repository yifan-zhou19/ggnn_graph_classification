package <missing>;

public class GlobalMembers
{
	public static void swap(tangible.RefObject<Integer> p, tangible.RefObject<Integer> q) //???????
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *temp=p;
		int temp = p.argValue;
		p.argValue = q.argValue;
		q.argValue = temp;
		return;
	}
	public static int Main()
	{
		int m; //????
		int n;
		int[] a = new int[100];
		int temper = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int s = m;
		while (m > 0) //??????
		{
		tangible.RefObject<Integer> tempRef_temper = new tangible.RefObject<Integer>(temper);
			swap(a[n - m], tempRef_temper);
			temper = tempRef_temper.argValue;
			for (int j = n - m;j > s - m;j--)
			{
				swap(a[j], a[j - 1]);
			}
		tangible.RefObject<Integer> tempRef_temper2 = new tangible.RefObject<Integer>(temper);
			swap(a[s - m], tempRef_temper2);
			temper = tempRef_temper2.argValue;
			m--;
		}
		for (int i = 0;i < n - 1;i++) //??
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		System.out.print("\n");
		return 0;
	}

}

