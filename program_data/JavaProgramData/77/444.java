import java.util.*;

String child = new String(new char[1000]);
char boy;
char girl;
int search = int;
int main()
{
	int i;
	child = new Scanner(System.in).nextLine();
	boy = child.charAt(0);

	for (i = 1; child.charAt(i) != '\0'; i++)
	{
		if (child.charAt(i) != boy)
		{
			girl = child.charAt(i);
			break;
		}
	}
	i = search(0);
	return 0;

}
int search(int m)
{
	int pos;
	if (child.charAt(m) != '\0')
	{
	if (child.charAt(m) == girl)
	{
		return m;
	}
	else
	{
		pos = search(m + 1);
		System.out.print(m);
		System.out.print(" ");
		System.out.print(pos);
		System.out.print("\n");
		return search(pos + 1);

	}
	}
	else
	{
		return 0;
	}

}
