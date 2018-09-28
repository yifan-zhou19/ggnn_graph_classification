//***********************************
//*???????                 **
//*??????1100012914         **
//*???.11.18                  **
//***********************************

String queue = new String(new char[100]);
char ch1;
char ch2;
int i;
int n;
int t;
int s;

void take_hand(int);

int main()
{
	queue = ConsoleInput.readToWhiteSpace(true).charAt(0);
	ch1 = queue.charAt(0);
	n = queue.length();
	for (i = 0; i < n; i++)
	{
		if (queue.charAt(i) != ch1)
		{
			ch2 = queue.charAt(i);
			break;
		}
	}
	for (s = 0; s < n / 2; s++)
	{
		i = 0;
		take_hand(i);
	}
	i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	return 0;
}

void take_hand(int j)
{

	for (t = j + 1; t < n; t++)
	{
		if (queue.charAt(t) == ch1 || queue.charAt(t) == ch2)
		{
			break;
		}
	}
	if (queue.charAt(t) == ch2)
	{
		queue = tangible.StringFunctions.changeCharacter(queue, j, '*');
		queue = tangible.StringFunctions.changeCharacter(queue, t, '*');
		System.out.print(j);
		System.out.print(" ");
		System.out.print(t);
		System.out.print("\n");
	}
	else
	{
		j++;
		take_hand(j);
	}
}


