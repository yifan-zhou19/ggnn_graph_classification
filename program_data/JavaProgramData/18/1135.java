//********************************
//*????????????   **
//*?????? 1200012988 **
//*???2012.11.19  **
//********************************


int smaller = new int(int, int);

int main()
{
	int n;
	int[][] a = new int[101][101];
	int i;
	int j;
	int k;
	int min;
	int count;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	count = n; //?count??n??
	for (k = 1; k <= count; k++)
	{
		int sum = 0;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (n > 1)
		{
			for (i = 0; i < n; i++)
			{
				min = a[i][0];
				for (j = 0; j < n; j++)
				{
					if (min >= a[i][j])
					{
						min = a[i][j]; //????????
					}
				}
				for (j = 0; j < n; j++)
				{
					a[i][j] -= min; //?????????????
				}
			}
			for (j = 0; j < n; j++)
			{
				min = a[0][j];
				for (i = 0; i < n; i++)
				{
					if (min >= a[i][j])
					{
						min = a[i][j]; //????????
					}
				}
				for (i = 0; i < n; i++)
				{
					a[i][j] -= min; //?????????????
				}
			}
			sum += a[1][1]; //sum??????????a[1][1]
			for (i = 0; i < n; i++)
			{
				for (j = 1 ;j < n - 1; j++)
				{
					a[i][j] = a[i][j + 1];
				}
			}
			for (j = 0; j < n - 1; j++)
			{
				for (i = 1; i < n - 1; i++)
				{
					a[i][j] = a[i + 1][j];
				}
			} //??
			n--;
		}
		System.out.print(sum);
		System.out.print("\n");
		n = count; //??n??
	}

	return 0;
}


