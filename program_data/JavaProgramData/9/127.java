package <missing>;

public class GlobalMembers
{
	public static void bubble_sort(int[] a, String[] b, int n)
	{
		int i;
		int j;
		int temp;
		char[] temp_ = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] empty = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		for (j = 1; j < n; j++)
		{
			for (i = 0; i < n - j; i++)
			{
				if (a[i] < a[i + 1])
				{
					temp = a[i];
					temp_ = b[i];
					a[i] = a[i + 1];
					b[i] = empty;
					b[i] = b[i + 1];
					a[i + 1] = temp;
					b[i + 1] = empty;
					b[i + 1] = temp_;

				}
			}
		}
	}

	public static int Main()
	{
		int[] age = new int[100];
		int[] Age_ = new int[100];
		int[] age_ = new int[100];
		int n;
		int i;
		char[][] id = new char[100][10];
		char[][] Id_ =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] id_ =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[] empty = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (age[i] >= 60)
			{
				Age_[i] = age[i];
				Id_[i] = id[i];
			}
			else
			{
				age_[i] = age[i];
				id_[i] = id[i];
			}
		}
		bubble_sort(Age_, Id_, n);
		for (i = 0;i < n; i++)
		{
			if (strcmp(Id_[i], empty) == 0)
			{
				continue;
			}
			else
			{
				System.out.printf("%s\n", Id_[i]);
			}
		}
		for (i = 0;i < n; i++)
		{
			if (strcmp(id_[i], empty) == 0)
			{
				continue;
			}
			else
			{
				System.out.printf("%s\n", id_[i]);
			}
		}
		return 0;
	}






}

