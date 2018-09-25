import java.util.*;

void queue(char[],int);
char boy;
char girl;
int main()
{
	String str = new String(new char[100]);
	str = new Scanner(System.in).nextLine();
	int l = str.length();
	boy = str.charAt(0);
	for (int i = 1;i < l;i++)
	{
		if (str.charAt(i) != boy)
		{
			girl = str.charAt(i);
			break;
		}
	}
	for (int i = 0;i < l;i++)
	{
	  queue(str,l);
	}
	return 0;
}
void queue(char a[],int s)
{

	for (int i = 0;i < s;i++)
	{
		if (a[i] == boy)
		{
			int k = 1;
			while (a[i + k] == '0')
			{
				k++;
			}
			if (a[i + k] == girl)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(i + k);
				System.out.print("\n");
				a[i] = '0';
				a[i + k] = '0';
				break;
			}
		}
	}
}
