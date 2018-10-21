/**
 * ??????
 * ???1000012844
 * ???????
 **/


void checkSymmetry(char *, int, int);

int main()
{
	int start;
	int lenth;
	String str = new String(new char[501]);

	str = ConsoleInput.readToWhiteSpace(true).charAt(0);

	for (lenth = 2; lenth <= str.length(); lenth++)
	{
		for (start = 0; start < str.length() - lenth + 1; start++)
		{
			checkSymmetry(str, start, start + lenth - 1);
		}
	}

	return 0;
}

void checkSymmetry(char str[], int start, int end)
{
	int i;
	for (i = 0; i <= (end - start) / 2; i++)
	{
		if (str[start + i] != str[end - i])
		{
			break;
		}
	}
	if (i > (end - start) / 2)
	{
		for (i = start; i <= end; i++)
		{
			System.out.print(str[i]);
		}
	System.out.print("\n");
	}
}

