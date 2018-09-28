import java.util.*;

String all = new String(new char[101]);
int[] times = new int[101];
void oper(char, int);
int main()
{
	char boy;
	int l;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(times, 0, (Integer.SIZE / Byte.SIZE));
	all = new Scanner(System.in).nextLine();
	l = all.length();
	boy = all.charAt(0);
	oper(boy, l);
	return 0;
}

void oper(char boy, int l)
{
	int i;
	int j;
	if (l == 0)
	{
		return;
	}
	for (i = 1; i < l; i++)
	{
		if (all.charAt(i) != boy && all.charAt(i - 1) == boy)
		{
			System.out.print(i - 1 + 2 * times[i - 1]);
			System.out.print(" ");
			System.out.print(i + 2 * times[i]);
			System.out.print("\n");
			for (j = i - 1; j < l - 2; j++)
			{
				all = tangible.StringFunctions.changeCharacter(all, j, all.charAt(j + 2));
				times[j + 2]++;
				times[j] = times[j + 2];
			}
			l -= 2;
			break;
		}
	}
	oper(boy, l);
	return;
}

