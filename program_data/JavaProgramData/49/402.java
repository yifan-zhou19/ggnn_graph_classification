import java.util.*;

void output(int);
String word = new String(new char[500]);
int len;
int main()
{
	int i;
	word = new Scanner(System.in).nextLine();
	len = word.length();
	for (i = 2; i <= len; i++)
	{
		output(i);
	}
	return 0;
}


void output(int i)
{
	int j;
	int k;
	for (j = 0; j <= len - i; j++)
	{
			k = j;
			while (word.charAt(k) == word.charAt(2 * j + i - 1 - k) && k < 2 * j + i - 1 - k)
			{
				k++;
			}
			if (k >= 2 * j + i - 1 - k)
			{
				for (k = j; k < j + i; k++)
				{
					System.out.print(word.charAt(k));
				}
				System.out.print("\n");
			}
	}
}
