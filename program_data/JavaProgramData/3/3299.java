int mycompare = new int(const Object*, const Object*);

int main()
{
	int n;
	int k;
	int[] a = new int[1008];
	int i;
	int j;
	int tag = 0;

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 0; i < n; i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

	qsort(a, n, 4, mycompare);

	for (i = 0; i < n / 2; i++)
	{
		int count = n - 1;

		while (count > i)
		{
			if (a[i] + a[count] == k)
			{
				tag = 1;
				break;
			}
			else if (a[i] + a[count] < k)
			{
				break;
			}
			else
			{
				count--;
			}
		}

		if (tag == 1)
		{
			break;
		}
	}

	if (tag == 1)
	{
		System.out.print("yes");
		System.out.print("\n");
	}
	else
	{
		System.out.print("no");
		System.out.print("\n");
	}



}

int mycompare(const Object * elem1, const Object * elem2)
{
	return *(int)elem1 - (int)elem2;
}

